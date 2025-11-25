/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author shraddhapatel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Leaf nodes
        DecisionNode approved = new DecisionNode("Approved");
        DecisionNode rejected = new DecisionNode("Rejected");

        // Credit Score Node
        DecisionNode creditNode = new DecisionNode("creditScore", 700, rejected, approved);

        // Income Node (Root)
        DecisionNode root = new DecisionNode("income", 50000, rejected, creditNode);

        // Decision Engine
        DecisionEngine engine = new DecisionEngine(root);

        // Test Applicants
        Applicant applicant1 = new Applicant(60000, 720, 10000);
        Applicant applicant2 = new Applicant(40000, 650, 5000);

        System.out.println("Applicant 1: " + engine.evaluate(applicant1)); // Approved
        System.out.println("Applicant 2: " + engine.evaluate(applicant2)); // Rejected
    }
}
