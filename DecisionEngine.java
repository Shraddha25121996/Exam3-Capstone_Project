/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shraddhapatel
 */
public class DecisionEngine {
        private DecisionNode root;

    public DecisionEngine(DecisionNode root) {
        this.root = root;
    }

    // Recursive method to evaluate an applicant
    public String evaluate(Applicant applicant) {
        return evaluateNode(root, applicant);
    }

    private String evaluateNode(DecisionNode node, Applicant applicant) {
        // If leaf node, return result
        if (node.getResult() != null) {
            return node.getResult();
        }

        // Example conditions: "income", "creditScore", "debt"
        if (node.getCondition().equals("income")) {
            if (applicant.getIncome() >= node.getThreshold()) {
                return evaluateNode(node.getRight(), applicant);
            } else {
                return evaluateNode(node.getLeft(), applicant);
            }
        } else if (node.getCondition().equals("creditScore")) {
            if (applicant.getCreditScore() >= node.getThreshold()) {
                return evaluateNode(node.getRight(), applicant);
            } else {
                return evaluateNode(node.getLeft(), applicant);
            }
        } else if (node.getCondition().equals("debt")) {
            if (applicant.getDebt() <= node.getThreshold()) {
                return evaluateNode(node.getRight(), applicant);
            } else {
                return evaluateNode(node.getLeft(), applicant);
            }
        }

        return "Error: Invalid Node";
    }
}

