**Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?**
Artemis Financial is a financial consulting firm that creates personalized financial plans for clients. They wanted to modernize their web application's security by implementing secure communication protocols and adding data verification checks, while ensuring no new vulnerabilities were introduced.

**What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?**
I did a good job documenting vulnerabilities and planning mitigation steps. Secure coding matters because it protects user data and prevents exploits. Strong software security builds customer trust and protects a company’s reputation.

**Which part of the vulnerability assessment was challenging or helpful to you?**
The most challenging part was handling the dependency check suppression file—there were a lot of outdated libraries with known issues. But using the OWASP tool definitely made the process faster than manual checks.

**How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?**
I added HTTPS, input validation, and checksum verification. In the future, I’d use automated tools like OWASP ZAP and dependency scanners to quickly find and prioritize fixes.

**How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?**
I tested the app thoroughly to make sure everything still worked. After refactoring, I ran another dependency scan and did some manual review to catch any new issues.

**What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?**
The OWASP Dependency-Check tool was super useful. I also relied on secure coding best practices like validating input and using encryption—stuff I’ll definitely use again.

**Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?**
I’d show the Vulnerability Assessment Report and the refactored code with HTTPS implementation. It’s a clear example of identifying risks and applying practical fixes.
