public class RowBooklet {
    private Subject subject;
    private String date;
    private int vote;

    public RowBooklet(Subject subject, String date, int vote){
        this.subject = subject;
        this.date = date;
        this.vote = vote;
    }

    public int getVote() {
        return vote;
    }

    @Override
    public String toString() {
        return "rowBooklet{" +
                "subject=" + subject +
                ", date=" + date +
                ", vote=" + vote +
                '}';
    }

}
