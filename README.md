# Borinquen Picks App

Borinquen Picks is an **Android** application built with **Jetpack Compose** that provides recommendations for various places in Puerto Rico. The app categorizes recommendations, such as restaurants, and displays the best options available. The UI supports both dark and light themes, and images are loaded asynchronously from **Firebase Storage** using the **Coil** library.

## Technologies Used
- **Kotlin**
- **Jetpack Compose**
- **MVVM Architecture**
- **Firebase Storage** (for hosting images)
- **Firebase Realtime Database** (for hosting the content data)
- **Coil** (for asynchronous image loading)
- **Material Design** (for UI components)

## How to Run the Project
1. Clone this repository:
   ```bash[
   git clone https://github.com/ORomero227/BorinquenPicks.git
2. Open the project in Android Studio.
3. Run the app on an emulator or a physical device.

## Usage
Borinquen Picks allows users to browse categorized recommendations effortlessly. The app follows a state-based navigation approach, ensuring smooth transitions between different screens.

### Features:
- **Category Selection**:
The app displays a menu with various categories (e.g., restaurants, attractions).
- **Recommendation List**:
When a category is selected, the app navigates to a screen displaying a list of recommendations for that category.
- **Recommendation Details**:
Selecting a recommendation opens a detailed screen, showing more information about the selected place, including images loaded asynchronously from Firebase Storage.

## Screenshots
![borinquenPicks_1](https://github.com/user-attachments/assets/bd48bce6-4b4a-4690-a324-21e06a731009)
![borinquenPicks_2](https://github.com/user-attachments/assets/2be623bb-0366-46a3-a28f-b4ba3aa3a0f9)
![borinquenPicks_3](https://github.com/user-attachments/assets/df68d2f1-1790-4ca5-b925-ea500421d978)
