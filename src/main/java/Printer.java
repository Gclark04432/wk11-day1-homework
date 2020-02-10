public class Printer {
    private int paperLeft;

    public Printer(int paperLeft){
        this.paperLeft = paperLeft;
    }

    public int checkPaperLeft(){
        return this.paperLeft;
    }
}
