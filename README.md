# Hexadecimal to Assembly Code

This repository contains a snippet of ARM assembly code.

## Overview

- I used machine language slides to solve this assignment.
- I had to go through 3 main categories:
  - data processing instructions
  - branch instructions
  - memory instructions
- Each instruction has its own style and structure: function part, condition part, and so on.
- Our main goal was to first identify the instructions, then follow their structure.
- I converted each hexadecimal value to binary.
- Each binary was divided into parts.
- At this stage, the OP part was critical for me.
- In the 00 case, I went with data processing instructions; in the 01 case, I went with memory instructions; and so on.
- After that, I just needed to find Rd (destination), Rn (first source), and Rm (second source).
- Each of these binaries was converted to decimal, and I put them in the code.
- I have included two images that show the code and the memory. In the memory, we can see all the hexadecimal values correctly.

## Images

![ARM Assembly Snippet](image1.png)

![Instruction Diagram](image2.png)
