# Lemonade App - Jetpack Compose

## Overview
The Lemonade App is a simple Jetpack Compose-based application that simulates the process of making lemonade. Users can interact with images by tapping to go through different stages: picking a lemon, squeezing it, drinking the lemonade, and restarting the process.

## Features
- Uses **Jetpack Compose** for UI design.
- **State management** using `remember` and `mutableStateOf`.
- **Composable functions** to create reusable UI components.
- **Theming** with `MaterialTheme` and a custom `LemonadeTheme`.
- **Click interactions** using `Modifier.clickable()`.

## How It Works
1. **Tap the lemon tree** to pick a lemon.
2. **Tap the lemon** multiple times to squeeze it.
3. **Tap the lemonade glass** to drink it.
4. **Tap the empty glass** to restart the process.

## Code Structure
### **MainActivity.kt**
- `MainActivity` is the entry point.
- Uses `LemonadeTheme` to apply app styling.
- `SqueezTheLemon()` is called to display the main UI.

### **Composable Functions**
1. **`SqueezTheLemon()`** - Handles the entire game logic and UI layout.
   - Displays images for different stages.
   - Updates state (`count`) on tap.
   - Shows appropriate instructions based on the stage.
2. **`ActionBar()`** - Placeholder function for future toolbar integration.
3. **`GreetingPreview()`** - Provides a preview of `SqueezTheLemon()` in Android Studio.

## Dependencies
- Jetpack Compose
- Material 3 Components
- AndroidX Libraries

## How to Run
1. Clone the repository.
2. Open the project in Android Studio.
3. Run the app on an emulator or a physical device.

## Future Enhancements
- Add sound effects for interactions.
- Implement animations for a smoother experience.
- Improve UI with more themes and customization.

### Happy Coding! 🚀

