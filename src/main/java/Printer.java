public class Printer {
    private int numberOfSheetsLeft;
    private int tonerVolume;

    public Printer(int numberOfSheetsLeft, int tonerVolume) {
        this.numberOfSheetsLeft = numberOfSheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getNumberOfSheetsLeft() {
        return numberOfSheetsLeft;
    }

    public int getTonerVolume(){
        return tonerVolume;
    }

    public String print(int numberOfPages, int numberOfCopies){
        int overallNumberOfPages = numberOfPages * numberOfCopies;
        if (numberOfSheetsLeft>overallNumberOfPages && tonerVolume>=overallNumberOfPages ){
            numberOfSheetsLeft -= overallNumberOfPages;
            tonerVolume -= overallNumberOfPages;
            return "Number of Sheets left " + numberOfSheetsLeft+ ". Toner volume left " +tonerVolume;
        }
        else
            return "Not enough paper or toner to complete print";

    }
}
