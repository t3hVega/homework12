public class Books {
    public static void main(String[] args) {
        Author markTwain = new Author("Mark", "Twain");
        Author stanislawLem = new Author("Stanislaw","Lem");
        Book solaris = new Book("Solaris", stanislawLem, 1959);
        Book theAdventuresOfTomSawyer = new Book("The Adventures of Tom Sawyer", markTwain,1876);
        solaris.setYear(1961);
        System.out.println("Book one is " + solaris.getTitle()
                + " by " + solaris.getAuthor().getName()
                + " " + solaris.getAuthor().getSurname()
                + " published in year " + solaris.getYear());
        System.out.println("Book two is " + theAdventuresOfTomSawyer.getTitle()
                + " by " + theAdventuresOfTomSawyer.getAuthor().getName()
                + " " + theAdventuresOfTomSawyer.getAuthor().getSurname()
                + " published in year " + theAdventuresOfTomSawyer.getYear());
        System.out.println("ДЗ сделано");
    }
}