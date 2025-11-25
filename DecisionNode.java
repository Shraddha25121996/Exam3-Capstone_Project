/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shraddhapatel
 */
public class DecisionNode {
    private String condition;   // e.g., "income > 50000"
    private int threshold;      // threshold for numeric comparison
    private DecisionNode left;  // left child node (condition false)
    private DecisionNode right; // right child node (condition true)
    private String result;      // final decision if leaf node ("Approved" / "Rejected")

    // Constructor for leaf node
    public DecisionNode(String result) {
        this.result = result;
        this.left = null;
        this.right = null;
        this.condition = null;
    }

    // Constructor for decision node
    public DecisionNode(String condition, int threshold, DecisionNode left, DecisionNode right) {
        this.condition = condition;
        this.threshold = threshold;
        this.left = left;
        this.right = right;
        this.result = null;
    }

    // Getters
    public String getCondition() { return condition; }
    public int getThreshold() { return threshold; }
    public DecisionNode getLeft() { return left; }
    public DecisionNode getRight() { return right; }
    public String getResult() { return result; }

    // Setters
    public void setLeft(DecisionNode left) { this.left = left; }
    public void setRight(DecisionNode right) { this.right = right; }
}

