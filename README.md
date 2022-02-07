# MuseumApp

This is a museum app.

- 4 screens using fragments.
- http call using Retrofit to the Metropolitan Museum of Art Collection API. https://metmuseum.github.io/

## Home screen
- Small about text
- Button call to action -> Takes user to category screen.
## Category screen
- Department cards.
- Hardcoded calls to each department.
## Results screen
- Recycler View with results.
- Each result is a link that takes to the simple view.
- Showing:
    - primaryImageSmall
    - title
    - artistDisplayName
    - objectDate
  ## Simple view screen
    - primaryImageSmall
    - title
    - artistDisplayName
    - objectDate
    - objectName ("painting")
    - department ("Egypt art")
    - medium ("oil in canvas")
    - artistDisplayBio  
      - artistBeginDate 
      - artistEndDate
      - nationality
  
## TECHNOLOGY

### ENDPOINTS
#### DEPARTMENTS
*GET /public/collection/v1/departments*

We are requesting this info for the categories screen.

We are limiting the department searches to these.
- 5 - Arts of Africa, Oceania, and the Americas
- 6 - Asian Art
- 10 - Egyptian Art
- 11 - European Paintings
- 13 - Greek and Roman Art
- 14 - Islamic Art
- 17 - Medieval Art
- 19 - Photographs



#### SEARCH
*GET /public/collection/v1/search*

This endpoint returns a list of IDs that we need to call again in the Object endpoint (check down). To improve performance, we will only take 50 of them and store its data in the SharedPreferences (cache). We are selecting specific data to store (check above). This way the app will be an offline app for the stored calls.
This endpoint accepts parameters, and we are going to use hasImages=true as default.
Because this endpoint needs a search query, we will use " cat " as default search.

Example:
*https://collectionapi.metmuseum.org/public/collection/v1/search?hasImages=true&tags=true&departmentId=[DEPARTMENT_ID]&q=" cat "*


#### OBJECT
*GET /public/collection/v1/objects/[objectID]*

We are checking this endpoint to get information about each id that search and department returns.

