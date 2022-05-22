package VotingApplication;

import java.util.*;
import java.util.stream.Collectors;

public class VotingService {

  static List<Candidate> candidates = new ArrayList<>();
  static Map<Integer, List<String>> mapOfTopCandidatesByRank = new HashMap<>();

  public static void main(String[] args) {
    Candidate candidate1 = new Candidate("Poonam Bansal");
    Candidate candidate2 = new Candidate("Yogesh Bansal");
    Candidate candidate3 = new Candidate("Shilpa Bansal");

    candidates.add(candidate1);
    candidates.add(candidate2);
    candidates.add(candidate3);

    addVote("Yash", candidate2, candidate3, candidate1);
    addVote("Shivani", candidate2, candidate1, candidate3);
    addVote("Subhakar", candidate1, candidate2, candidate3);

    displayNumberOfRankOnesByCandidate();
    displayTopCandidatesByRank(1);
    displayTopCandidatesByRank(2);
    displayTopCandidatesByRank(3);
  }

  public static void addVote(String voterName, Candidate candidate1, Candidate candidate2, Candidate candidate3) {
    Vote vote = new Vote("Yash", candidate2, candidate3, candidate1);
    vote.setCandidate1(candidate1.getCandidateName());
    vote.setCandidate2(candidate2.getCandidateName());
    vote.setCandidate3(candidate3.getCandidateName());
    updateRanks(vote);
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

  public static void displayNumberOfRankOnesByCandidate() {

    candidates.forEach(candidate -> System.out.println(candidate.getCandidateName() + " is Ranked1 "
        + candidate.getNumberOfRank1() + " times"));
  }

  public static void displayTopCandidatesByRank(int rank) {
    List<String> candidatesWithRankOne = new ArrayList<>();

    if(rank == 1) {
      Candidate candidate = Collections.max(candidates, new Comparator<Candidate>() {
        @Override
        public int compare(Candidate c1, Candidate c2) {
          if (c1.getNumberOfRank1() == c2.getNumberOfRank1()) {
            return 0;
          } else if (c1.getNumberOfRank1() > c2.getNumberOfRank1()) {
            return 1;
          } else if (c1.getNumberOfRank1() < c2.getNumberOfRank1()) {
            return -1;
          }
          return 0;
        }
      });
      System.out.println("1st Ranked candidate is: " + candidate.getCandidateName());

    } else if (rank == 2) {
      Candidate candidate = Collections.max(candidates, new Comparator<Candidate>() {
        @Override
        public int compare(Candidate c1, Candidate c2) {
          if (c1.getNumberOfRank2() == c2.getNumberOfRank2()) {
            return 0;
          } else if (c1.getNumberOfRank2() > c2.getNumberOfRank2()) {
            return 1;
          } else if (c1.getNumberOfRank2() < c2.getNumberOfRank2()) {
            return -1;
          }
          return 0;
        }
      });
      System.out.println("2nd Ranked candidate is: " + candidate.getCandidateName());

    } else if (rank == 3) {
      Candidate candidate = Collections.max(candidates, new Comparator<Candidate>() {
        @Override
        public int compare(Candidate c1, Candidate c2) {
          if (c1.getNumberOfRank3() == c2.getNumberOfRank3()) {
            return 0;
          } else if (c1.getNumberOfRank3() > c2.getNumberOfRank3()) {
            return 1;
          } else if (c1.getNumberOfRank3() < c2.getNumberOfRank3()) {
            return -1;
          }
          return 0;
        }
      });
      System.out.println("3rd Ranked candidate is: " + candidate.getCandidateName());

    } else {
      System.out.println("Not a valid rank");
    }
   }

}
