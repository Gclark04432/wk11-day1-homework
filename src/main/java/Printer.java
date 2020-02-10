public class Printer {
    private int paperLeft;

    public Printer(int paperLeft){
        this.paperLeft = paperLeft;
    }

    public int checkPaperLeft(){
        return this.paperLeft;
    }

    public boolean hasEnoughPaperToPrint(int paperRequired){
        return this.paperLeft >= paperRequired;
    }

    public int printPages(int numberOfPagesToPrint) {
        if (hasEnoughPaperToPrint(numberOfPagesToPrint)) {
            this.paperLeft -= numberOfPagesToPrint;
            return this.paperLeft;
        }
        return this.paperLeft;
    }

}
