public class MSword extends Thread {
    public void run(){
        if(getName().equals("Typing...")){
            Typing();
        }
        else if(getName().equals("Checking...")){
            spellCheck();
        }else{
            getName().equals("Saving...");
        }
    }
    void Typing(){
        int i;
        try{
            for(i=1;i<=20;i++){
                System.out.println("Typing");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void autosave(){
        try{
            for(; ;){
                System.out.println("Saving...");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void spellCheck(){
        try {
            for(; ;){
                System.out.println("Checking...");
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


