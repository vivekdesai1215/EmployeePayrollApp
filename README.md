## Employee Payroll App
📌 Overview
The Employee Payroll App is a Java-based console application designed to manage employees, generate payslips, and provide role-specific dashboards for managers and regular employees. It demonstrates core programming concepts such as object-oriented design, exception handling, collections, and modular architecture.

🚀 Features
User Authentication
Sign up with email and password (validated with custom rules).
Login with existing credentials.
Employee Management
Supports multiple roles: Manager and RegularEmployee.
View and update employee profile information.
Payroll Service
Generate detailed payslips with salary components (Basic, HRA, DA, Allowances, PF, Tax).
Print payslips and save them as text or PDF files.
Dashboards
Role-based dashboards (ManagerDashboard, EmployeeDashboard) for personalized views.

Validation
Custom InvalidDataException for handling invalid inputs.
Password strength validation (length, uppercase, lowercase, digit, special character).

🛠️ Tech Stack
Language: Java (Core Java concepts)

Packages:
com.employee → Employee classes, login/signup, user accounts
com.payrollservice → Payroll generation and payslip handling
com.dashboard → Role-based dashboards
com.security → Password hashing 
com.validator → Custom exception handling and validation

Build Tool: Plain Java (can be run with javac and java)


REST API for payroll services.

Unit tests for validation and payroll logic.
