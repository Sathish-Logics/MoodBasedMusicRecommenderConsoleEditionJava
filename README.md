# 🎵 Mood-Based Music Recommender (Console Edition) - Java

This is a Java-based console application that plays music based on the user's selected mood. It’s designed as a simple command-line tool to demonstrate basic Java programming, user interaction, and file handling using `.wav` audio files.

---

## 💡 Features

- 🎧 Recommends and plays music based on the mood you select.
- 🧠 Simple, intuitive console interface.
- 🔊 Supports `.wav` audio files for playback.

---

## 📦 How It Works

1. **User launches the application.**
2. **The console displays mood options:**  
   - Happy  
   - Sad  
   - Chill
3. **User selects a mood.**
4. **The application plays the corresponding `.wav` file.**

---

## 🛠 Technologies Used

- Java (JDK 8 or above)
- Java Sound API
- Console I/O
- Basic OOP Principles

---

## 📁 Project Structure

MoodBasedMusicRecommenderConsoleEditionJava/
├── src/
│ ├── Main.java
│ ├── PlayHappyMusic.java
│ ├── PlaySadMusic.java
│ └── PlayChillMusic.java
├── bin/ # Compiled .class files (excluded from Git)
├── lib/ # External libraries if any
├── .gitignore
└── README.md

yaml
Copy
Edit

> Note: Large `.wav` files are not included in the GitHub repo to respect file size limits. You can add your own audio files to the `src/resources/` folder or update the paths accordingly.

---

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Sathish-Logics/MoodBasedMusicRecommenderConsoleEditionJava.git
   cd MoodBasedMusicRecommenderConsoleEditionJava
Add your .wav files to a resources/ folder (e.g., src/resources/Happy.wav, etc.).

Compile the project:

bash
Copy
Edit
javac -d bin src/*.java
Run the program:

bash
Copy
Edit
java -cp bin Main
⚠️ Disclaimer
This project is built for educational/demo purposes.

You must supply your own .wav files due to GitHub's file size restrictions.

🙏 Acknowledgements
Created with passion to explore Java and music!
Special thanks to all open-source contributors and Java developers who inspired this project.

