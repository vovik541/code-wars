# 🏗️🌟 Build Tower

This kata builds a **pyramid-shaped tower** from a given number of floors.  
Each floor is represented by a string made of the `*` character, and the tower is returned as an array/list of strings.

---

### ✅ Requirements

- Input is a **positive integer** (`nFloors`)
- Each floor should be **centered** with spaces on both sides
- The bottom floor has the **widest number of `*`**
- The function should return an array of strings

---

### 📥 Function Signature

```java
public static String[] towerBuilder(int nFloors)
```

---

### 📌 Examples
```java
towerBuilder(3);
// ➜ [
//      "  *  ",
//      " *** ",
//      "*****"
//    ]

towerBuilder(6);
// ➜ [
//      "     *     ",
//      "    ***    ",
//      "   *****   ",
//      "  *******  ",
//      " ********* ",
//      "***********"
//    ]
