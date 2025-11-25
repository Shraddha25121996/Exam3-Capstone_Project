# Exam 3 – Capstone Project  
## Phase 1: Requirements & Design Document  
### Student: Shraddha Patel  
### Topic: Option D – The Decision Engine (Trees)

---

## 1. Problem Description
This project uses a **Decision Tree** to simulate a real-world automated loan approval system.  
Banks use decision engines to classify applicants as **Approved** or **Rejected** based on multiple factors such as:

- Income  
- Credit Score  
- Debt Ratio  
- Employment Status  

A tree is the best structure because decisions naturally follow a hierarchical path:  
**Root → Branch → Leaf Node (Final Decision)**

---

## 2. Why a Tree is the Right Data Structure
A Tree allows:

- **Fast Lookup (O(log n))** if the tree is balanced  
- **Clear hierarchical decision-making**  
- **Easy expansion** (add new rules without rewriting system)  
- **Readable logic** for explainable AI decisions  

Array or HashMap would not show hierarchical rules clearly.  
Graph would be unnecessarily complex.

---

## 3. UML Diagram (High-Level)
     +---------------------+
     |      DecisionNode   |
     +---------------------+
     | - condition: String |
     | - threshold: int    |
     | - left: Node        |
     | - right: Node       |
     | - result: String    |
     +---------------------+
            /      \
           /        \
+––––––––+   +——————+
| DecisionEngine |   | Applicant        |
+––––––––+   +——————+
| + evaluate()   |   | + income:int     |
| + buildTree()  |   | + credit:int     |
+––––––––+   +——————+
---

## 4. Big-O Analysis

### Building the tree  
- Each insert operation is **O(log n)** (if balanced).  
- Worst case (unbalanced): **O(n)**.

### Evaluating a new applicant  
- Follows a single path from root → leaf.  
- Time complexity: **O(log n)**  
- Worst case: **O(n)** (only if tree is skewed).

### Memory Usage  
- Space complexity: **O(n)** for storing all nodes.

---

## 5. Summary  
The Decision Tree is ideal for implementing a real-world decision engine because it offers clear rule-based classification, efficient lookup, and scalable structure for future enhancements.
