package VotingApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class VotingService {

  static List<Candidate> candidates = new ArrayList<>();

  public static void main(String[] args) {
    Candidate candidate1 = new Candidate("Poonam Bansal");
    Candidate candidate2 = new Candidate("Yogesh Bansal");
    Candidate candidate3 = new Candidate("Shilpa Bansal");

    candidates.add(candidate1);
    candidates.add(candidate2);
    candidates.add(candidate3);

    Vote vote1 = new Vote("Yash", candidate2, candidate3, candidate1);
    Vote vote2 = new Vote("Shivani", candidate2, candidate1, candidate3);
    Vote vote3 = new Vote("Subhakar", candidate1, candidate2, candidate3);

    updateRanks(vote1);
    updateRanks(vote2);
    updateRanks(vote3);
    displayRanksByCandidate();
  }

  private static void updateRanks(Vote vote) {

    candidates.forEach(candidate -> {
      if (candidate.getCandidateName().equals(vote.candidate1)) {
        candidate.setNumberOfRank1(candidate.getNumberOfRank1()+1);
      }
      if (candidate.getCandidateName().equals(vote.candidate2)) {
        candidate.setNumberOfRank2(candidate.getNumberOfRank2()+1);
      }
      if (candidate.getCandidateName().equals(vote.candidate3)) {
        candidate.setNumberOfRank3(candidate.getNumberOfRank3()+1);
      }});
  }

  public static void displayRanksByCandidate() {

    candidates.forEach(candidate -> System.out.println(candidate.getCandidateName() + " is Ranked1 "
        + candidate.getNumberOfRank1() + " times"));
  }
}
