<div align="center">

# 🏨 Hotel Management System

**A comprehensive Java-based desktop application for managing hotel operations efficiently.**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=for-the-badge)

</div>

---

## 📌 Overview

The **Hotel Management System** is a desktop application developed in Java using the NetBeans IDE. It is designed to digitize and streamline the day-to-day operations of a hotel — from managing room availability and guest check-ins to generating bills and maintaining customer records. This system eliminates manual paperwork, reduces human error, and provides an organized, efficient environment for hotel staff and administrators.

---

## 🎯 Key Features

| Feature | Description |
|--------|-------------|
| 🔐 **Admin Login** | Secure authentication for authorized staff only |
| 🛏️ **Room Management** | Add, update, and track room availability and types |
| 👤 **Customer Records** | Register and manage guest information |
| ✅ **Check-In / Check-Out** | Smooth guest arrival and departure handling |
| 💰 **Billing System** | Auto-generate invoices based on stay duration and services |
| 📊 **Dashboard** | Overview of hotel occupancy and daily operations |

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 8+)
- **IDE:** Apache NetBeans
- **UI Framework:** Java Swing
- **Database:** MySQL
- **Build Tool:** Apache Ant (`build.xml`)

---

## 📁 Project Structure

```
Hotel_Management_System/
│
├── src/
│   └── hotel/management/system/    # All Java source files (UI + Logic)
│
├── build/
│   └── classes/                    # Compiled .class files
│
├── nbproject/                      # NetBeans project configuration
│   ├── build-impl.xml
│   └── project.properties
│
├── build.xml                       # Apache Ant build script
├── manifest.mf                     # JAR manifest file
└── README.md                       # Project documentation
```

---

## 🚀 Getting Started

### ✅ Prerequisites

Make sure the following are installed on your system:

- [Java JDK 8+](https://www.oracle.com/java/technologies/downloads/)
- [Apache NetBeans IDE](https://netbeans.apache.org/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/) + [MySQL Workbench](https://www.mysql.com/products/workbench/) *(optional)*

---

### ⚙️ Installation & Setup

**1. Clone the repository**
```bash
git clone https://github.com/Ayesha0144/Hotel_Management_System.git
```

**2. Open in NetBeans**
- Launch NetBeans IDE
- Go to `File` → `Open Project`
- Select the cloned `Hotel_Management_System` folder
- Click **Open Project**

**3. Set up the Database**
- Open MySQL and create a new database:
  ```sql
  CREATE DATABASE hotel_db;
  ```
- Import the provided SQL file *(if available)* or manually create the required tables

**4. Configure Database Connection**
- Open the database configuration file in `src/hotel/management/system/`
- Update the following credentials:
  ```java
  String url = "jdbc:mysql://localhost:3306/hotel_db";
  String user = "your_mysql_username";
  String password = "your_mysql_password";
  ```

**5. Run the Project**
- Press `F6` or click the **Run** button in NetBeans
- The login screen will appear — enter admin credentials to access the system

---

## 🤝 Contributing

Contributions are welcome! If you'd like to improve this project:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/your-feature-name`
3. Commit your changes: `git commit -m "Add: your feature description"`
4. Push to the branch: `git push origin feature/your-feature-name`
5. Open a **Pull Request**

---

## 📄 License

This project is intended for **educational purposes**. Feel free to use and modify it for learning or academic projects.

---

## 👩‍💻 Author

**Ayesha**
🎓 BS Computer Science Student

[![GitHub](https://img.shields.io/badge/GitHub-Ayesha0144-181717?style=flat&logo=github)](https://github.com/Ayesha0144)

---

<div align="center">
  <sub>⭐ If you found this project helpful, please consider giving it a star!</sub>
</div>
