package VotingApplication;

public class Candidate {

  String candidateName;

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

  int numberOfRank1;
  int numberOfRank2;
  int numberOfRank3;

  public Candidate(String CandidateName) {
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

}
