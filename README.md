# LinkedIn Designer Search (Selenium Project)

This project uses **Selenium WebDriver with Java** to log into LinkedIn, 
search for "Designers", and save the profile names into a CSV file.

## Requirements
- Java JDK (8 or above)
- Eclipse IDE
- Google Chrome (latest version)
- ChromeDriver (same version as your Chrome)
- Selenium Java libraries

## How to Run
1. Download or clone this project.
2. Open it in Eclipse IDE.
3. Add Selenium JAR files to the project.
4. In `LinkedInScraper.java`, update:
   - Your LinkedIn email and password
   - The path to your `chromedriver.exe`
5. Run the project as a Java Application.
6. Check `output.csv` for the extracted profile names.

## Notes
- Use a test LinkedIn account (not your personal one).
- You can change "Designer" in the code to search for other jobs (like Engineer, Doctor, etc.).

