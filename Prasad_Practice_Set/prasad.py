import os
import hashlib

def get_file_hash(file_path):
    """Compute the SHA-256 hash of the file."""
    hash_sha256 = hashlib.sha256()
    with open(file_path, 'rb') as file:
        while chunk := file.read(8192):
            hash_sha256.update(chunk)
    return hash_sha256.hexdigest()

def find_and_remove_duplicates(directory):
    """Find and remove duplicate files in the specified directory."""
    file_hashes = {}
    for root, dirs, files in os.walk(directory):
        for file_name in files:
            file_path = os.path.join(root, file_name)
            file_hash = get_file_hash(file_path)
            
            if file_hash in file_hashes:
                print(f"Duplicate found: {file_path}")
                os.remove(file_path)
                print(f"Removed: {file_path}")
            else:
                file_hashes[file_hash] = file_path

if __name__ == "__main__":
    directory = input("Enter the directory path to scan for duplicates: ")
    if os.path.isdir(directory):
        find_and_remove_duplicates(directory)
    else:
        print("Invalid directory path.")
