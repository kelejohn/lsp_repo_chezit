package org.howard.edu.lsp.midterm.question3;

/**
 * The VotingMachineDriver class tests the functionality of the VotingMachine class.
 */
public class VotingMachineDriver {
    public static void main(String[] args) {
        // Create a VotingMachine instance
        VotingMachine vm = new VotingMachine();

        // Add candidates and cast votes
        vm.addCandidate("Alsobrooks");
        vm.castVote("Alsobrooks");

        vm.addCandidate("Hogan");
        vm.castVote("Hogan");
        vm.castVote("Alsobrooks"); // Cast another vote for Alsobrooks

        // Print out the results
        System.out.println(vm.toString());
    }
}
