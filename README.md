# Sirius Soccer ⚽️

## Background
This project is a solution to the semester group project in the course "TDT4250 - Avansert programvaredesign".

## Case
**Part 1:** Create a parser to transform a publicly available data set into a format which can be used within the [Eclipse Modelling Framework (EMF)](https://www.eclipse.org/modeling/emf/) with Eclipse (XMI). 

**Part 2:** Create an e-core model of the data set using EMF. 

**Part 3:** Create a tool using either Sirius (for creating a graphical view/editor) or XText (DSL) to either view or modify the existing data set.

## Solution
The group chose to use a [Soccer data set from kaggle.com](https://www.kaggle.com/hugomathien/soccer), which consist of soccer matches, teams and players from eight leagues for the seasons 2009-2016. The data was stored in an SQLite-database, which would first be parsed into a CSV-format using capabilities within IntelliJ and then be processed by a custom parser created by the group. In addition to the original structure of the data set, the parser creates multiple new tables and relations between the data - like season standings for teams, and player positions within a match (e.g., "keeper", "defence"). The format of the output from the parser corresponds to the e-core model definition, so the tasks of modeling and parsing were done in parallel. Finally, a graphical tool using Sirius was made, which supports navigation of the data set with details about the teams and matches.



