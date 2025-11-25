/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shraddhapatel
 */
public class Applicant {
    private int income;
    private int creditScore;
    private int debt;

    public Applicant(int income, int creditScore, int debt) {
        this.income = income;
        this.creditScore = creditScore;
        this.debt = debt;
    }

    // Getters
    public int getIncome() { return income; }
    public int getCreditScore() { return creditScore; }
    public int getDebt() { return debt; }
}

