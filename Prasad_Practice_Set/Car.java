class Car {
    private int tyre,door;

    public void settyre(int tyre){
        if(tyre>3){
            this.tyre=tyre;
        }
       
    }
    public int gettyre(){
        return tyre;
    }

    public void setdoor(int door){
        if(door>3){
            this.door=door;
        }
       
    }
    public int getdoor(){
        return door;
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.settyre(2);
        System.out.println(c.gettyre());

        c.setdoor(4);
        System.out.println(c.getdoor());
    }
}