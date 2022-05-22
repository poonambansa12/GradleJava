package VotingApplication;

public class Candidate implements Comparable<Candidate> {

  String candidateName;
  int numberOfRank1;
  int numberOfRank2;
  int numberOfRank3;

  public Candidate(String candidateName) {
    this.candidateName = candidateName;
    this.numberOfRank1=0;
    this.numberOfRank2=0;
    this.numberOfRank3=0;
  }

  public String getCandidateName() {
    return candidateName;
  }

  public void setCandidateName(String candidateName) {
    this.candidateName = candidateName;
  }
  public int getNumberOfRank1() {
    return numberOfRank1;
  }

  public void setNumberOfRank1(int numberOfRank1) {
    this.numberOfRank1 = numberOfRank1;
  }

  public int getNumberOfRank2() {
    return numberOfRank2;
  }

  public void setNumberOfRank2(int numberOfRank2) {
    this.numberOfRank2 = numberOfRank2;
  }

  public int getNumberOfRank3() {
    return numberOfRank3;
  }

  public void setNumberOfRank3(int numberOfRank3) {
    this.numberOfRank3 = numberOfRank3;
  }

  @Override
  public int compareTo(Candidate o) {
    return (this.candidateName).compareTo(o.getCandidateName());
  }

  public int compare(Candidate c1, Candidate c2, int rank) {
    if (rank == 1) {
      return c1.numberOfRank1 - c2.numberOfRank1;
    } else if (rank == 2) {
      return c1.numberOfRank2 - c2.numberOfRank2;
    } else if (rank == 3) {
      return c1.numberOfRank3 - c2.numberOfRank3;
    }

    return 0;
  }

}
