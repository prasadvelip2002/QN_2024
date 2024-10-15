class ThreadDemo{
    public static void main(String[] args) {
        MSword m1=new MSword();
        MSword m2=new MSword();
        MSword m3=new MSword();

        m1.setName("Typing");
        m2.setName("Saving");
        m2.setDaemon(true);
        m3.setName("Checking");
        m3.setDaemon(true);

        m1.start();
        m2.start();
        m3.start();
    }
}
