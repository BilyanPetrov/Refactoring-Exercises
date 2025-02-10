# Refactoring-Exercises

Repository for Java exercises on refactoring and improving code design.

# Project Structure

The project will follow this general structure:

- Source dir parent: `src/chapter_{index}/{example_project_package}`
    - `/initial` package containing the initial (often ***problematic***) code
    - `/iteration_{index}` package/s for each iteration of improved code design
    - `/notes` directory for other README.md files documenting notes and tips from this example section
- Unit test dir parent: `test/chapter_{index}`
    - `/initial` unit tests for the initial code
    - `/iteration_{index}` unit tests adapted for each new iteration code

# Comments and Notes

## README Notes

README notes are to be added to each example package, and should generally follow this structure:

- Notes will outline the different methodologies and forms of refactoring which were observed in that section.
- Notes will contain links to Java classes showcasing those refactoring methodologies in action.
- Tips:
    - Pieces of advice for all programmers to keep in mind

## Comments

The Java classes inside this project might contain multi/inline comments which:

- indicate precisely where refactoring took place:
    - ```java
      // Refactored: <general action performed>
      ```
- outline a general issue with the code below them:
    - ```java
      // Problem Statement: <general design/lint problem description>
      ``` 

## Note links

- **Chapter 1**
    - [VideoStore](src/chapter_1/VideoStore/notes/README.md)
