package VotingApplication;

public class Vote {

  String voterName;
  String candidate1;
  String candidate2;
  String candidate3;

  public Vote(String voterName, Candidate candidate1, Candidate candidate2, Candidate candidate3) {
    this.voterName = voterName;
    this.candidate1 = candidate1.getCandidateName();
    this.candidate2 = candidate2.getCandidateName();
    this.candidate3 = candidate3.getCandidateName();
  }

  public String getVoterName() {
    return voterName;
  }

  public void setVoterName(String voterName) {
    this.voterName = voterName;
  }

}
