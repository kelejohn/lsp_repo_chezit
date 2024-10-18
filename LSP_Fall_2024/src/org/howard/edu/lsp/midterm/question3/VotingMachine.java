package org.howard.edu.lsp.midterm.question3;

import java.util.HashMap;
import java.util.Map;

/**
 * The VotingMachine class represents a simplified electronic voting machine
 * Abilities include adding candidates, casting votes, and printing results.
 */
public class VotingMachine {
    
    // HashMap to store candidate names and vote counts
    private Map<String, Integer> candidates;

    // Constructor
    public VotingMachine() {
        candidates = new HashMap<>();
    }

    /**
     * Adds a candidate to the list of candidates.
     * 
     * @param name : the name of the candidate to add
     */
    public void addCandidate(String name) {
        if (!candidates.containsKey(name)) {
            candidates.put(name, 0); // Add candidate with 0 votes
        } else {
            System.out.println("Candidate " + name + " is already in the list.");
        }
    }

    /**
     * Casts a vote to the specified candidate.
     * 
     * @param name : the name of the candidate to vote for
     */
    public void castVote(String name) {
        if (candidates.containsKey(name)) {
            candidates.put(name, candidates.get(name) + 1); // Increment vote count
        } else {
            System.out.println("Candidate " + name + " is not in the list.");
        }
    }

    /**
     * @return a string with the candidates and their vote counts
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : candidates.entrySet()) {
            result.append("Candidate: ").append(entry.getKey())
                  .append(", Votes: ").append(entry.getValue()).append("\n");
        }
        return result.toString();
    }
}
