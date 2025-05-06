# ❌🟢 XO Balance Checker

This simple kata checks whether a given string contains the **same number of 'x's and 'o's** (case-insensitive).  
The function should return a boolean value.

---

### ✅ Requirements

- Must be **case-insensitive**
- Can contain **any characters**
- Should return `true` if **neither 'x' nor 'o' is present**

---

### 📥 Function Signature

```java
public static boolean XO(String str)
```
---
### 📌 Examples

```java
XO("ooxx");     // ➜ true
XO("xooxx");    // ➜ false
XO("ooxXm");    // ➜ true
XO("zpzpzpp");  // ➜ true  // No 'x' or 'o' — returns true
XO("zzoo");     // ➜ false

