# Days Without... Tracker 📱

An Android application for tracking progress in quitting bad habits (smoking and alcohol consumption).

 **NOTE**: The UI is currently in Russian only. This app was originally developed as a personal tool to help quit smoking, so the interface is in Russian. However, the code is well-documented and can be easily localized to other languages if needed.

## 🎯 Description

"Days Without... Tracker" helps users stay motivated on their journey to a healthier lifestyle by showing:
- Number of days without the bad habit
- Visual progress toward the 365-day goal
- Achievement system with health benefit descriptions
- Personalized recommendations based on gender and habit type
- Money saved calculator
- Home screen widget for constant motivation

## ✨ Key Features

- **Personalization**: Choose gender and habit type
- **Visual Progress**: Animated progress bar with detailed statistics
- **Achievement System**: 10 checkpoints for each category with notifications
- **Money Calculator**: Track savings from quitting
- **Widget**: Display progress on home screen
- **Notifications**: Push notifications for achievements and daily motivation
- **Dark Theme**: Comfortable usage at any time of day
- **Key Metrics Grid**: Informative 2x2 grid (days, progress, money, achievements)
- **Simplicity**: Intuitive user interface

## 🛠 Technologies

- **Language**: Kotlin
- **UI**: Jetpack Compose
- **Architecture**: MVVM + Clean Architecture
- **Database**: Room
- **DI**: Hilt
- **Async**: Coroutines + Flow
- **Background Tasks**: WorkManager
- **Settings**: DataStore (Preferences)
- **Widgets**: Glance API

## 📋 Requirements

- Android 7.0 (API 24) or higher
- 50 MB of free space

## 🚀 Installation and Launch

### For Users
1. Download the APK file from releases
2. Allow installation from unknown sources
3. Install the application
4. Launch and follow the setup instructions
5. (Optional) Add widget to home screen

### For Developers

#### Build Requirements
- Android Studio Arctic Fox+
- JDK 17
- Android SDK API 34

#### Clone and Build
```bash
git clone <repository-url>
cd DaysWithoutTracker
./gradlew assembleDebug
```

#### Run Tests
```bash
./gradlew test
./gradlew connectedAndroidTest
```

## 📱 Screenshots

### Onboarding Screen
Choose gender, habit type, and configure money calculator for personalized experience.

### Main Screen
- Day counter with detailed time
- Animated progress bar
- Key metrics grid (days, progress, money, achievements)
- Achievement list with progress

### Home Screen Widget
- Compact progress display (4x2)
- Days and hours count
- Progress bar to one year
- Quick access to app

### Settings Screen
- Dark theme toggle
- Notification settings
- Money calculator editor
- Counter reset
- Profile change
- App information

## 🏗 Architecture

```
Presentation Layer (Compose UI + Widgets)
    ↓
Domain Layer (Use Cases)
    ↓
Data Layer (Room Database + DataStore)
    ↓
Workers (Background Tasks)
```

### Main Components
- **ViewModels**: UI state management
- **Use Cases**: Business logic
- **Repository**: Data access abstraction
- **Room Database**: Local storage for profile and checkpoints
- **DataStore**: Settings storage (theme, notifications)
- **WorkManager**: Background tasks (notifications, widget updates)
- **Widget Provider**: Home screen widget

## 📊 Achievement System

The app contains unique checkpoint sets for each combination:

### 🚭 Quitting Smoking
- 1 day → Nicotine level decrease
- 7 days → Lung function improvement
- 30 days → Blood circulation improvement
- 365 days → Critical recovery milestone

### 🍷 Quitting Alcohol
- 1 day → Sleep quality improvement
- 7 days → Blood sugar normalization
- 30 days → Liver regeneration begins
- 365 days → Major health milestone

*Full achievement list differs for men and women*

### 🔔 Achievement Notifications
When reaching each checkpoint, the app sends a congratulatory notification with a personalized message.

## 💰 Money Saved Calculator

Customizable calculator allows tracking financial benefits from quitting:

- **Setup**: Cost per unit and quantity per day
- **Currency**: Custom currency symbol
- **Display**: In key metrics grid on main screen
- **Editing**: Anytime through settings

**Example**: If you smoked 1 pack per day at $5, after a month you'll save $150!

## 🔔 Notification System

### Achievement Notifications
- Automatic sending when reaching checkpoint
- Personalized messages
- Configurable in settings

### Daily Motivation
- Random motivational message every day at 9:00 AM
- Pool of several inspiring phrases
- Can be disabled in settings

## 🎨 Design

- **Material Design 3**: Modern Google design language
- **Dark Theme**: Automatic or manual switching
- **Adaptivity**: Support for various screen sizes
- **Animations**: Smooth transitions and effects
- **Color Scheme**: Green shades symbolizing health
- **Key Metrics**: Informative 2x2 grid with icons

## 📁 Project Structure

```
app/src/main/java/com/dayswithoutracker/
├── data/           # Data layer
│   ├── database/   # Room DB
│   └── repository/ # Repositories
├── domain/         # Business logic
│   ├── model/      # Data models
│   ├── repository/ # Repository interfaces
│   └── usecase/    # Use Cases
├── presentation/   # UI components
│   ├── main/       # Main screen
│   ├── onboarding/ # Onboarding
│   ├── settings/   # Settings
│   ├── components/ # Reusable components
│   └── theme/      # Themes and styles
├── widget/         # Widgets
├── worker/         # Background Workers
├── util/           # Utilities
└── di/            # Dependency Injection
```

## 🧪 Testing

- **Unit Tests**: Use Cases, ViewModels
- **Integration Tests**: Database, Repository
- **UI Tests**: Navigation, interaction

## 📈 Performance

- **Lazy Loading**: Optimized data loading
- **State Management**: Reactive UI with StateFlow
- **Compose**: Efficient recomposition
- **WorkManager**: Optimized background tasks
- **Widget**: Hourly updates for battery saving

## 🔒 Security

- **Local Storage**: All data stays on device
- **Minimal Permissions**: Only necessary access rights
- **Validation**: User input verification
- **Encryption**: DataStore with secure settings storage

## 🌍 Localization

- ✅ Russian language (UI)
- 🔄 Planned: English, other languages


## 📋 What's New in Version 1.1

### ✅ Implemented
- ✅ Home screen widget (4x2)
- ✅ Push notifications for achievements
- ✅ Daily motivational notifications
- ✅ Money saved calculator
- ✅ Dark theme
- ✅ Key metrics grid (2x2)
- ✅ Notification settings
- ✅ Detailed time display (days + hours)

## 🤝 Contributing

We welcome contributions to the project! Please:

1. Fork the repository
2. Create a branch for new feature
3. Make changes
4. Add tests
5. Create Pull Request

## 📄 License

This project is distributed under the MIT License for **non-commercial use only**. 

### Terms of Use:
- ✅ **Free to use** for personal, educational, and non-commercial purposes
- ✅ **Free to modify** and customize for your needs
- ✅ **Free to share** with others (non-commercially)
- ❌ **Commercial use is prohibited** without explicit permission
- ❌ **Selling or monetizing** this app or its derivatives is not allowed

If you wish to use this app for commercial purposes, please contact the project maintainers.

See the `LICENSE` file for full details.

## 📞 Support

If you have questions or suggestions:
- Create an Issue in the repository
- Contact the development team

## 🙏 Acknowledgments

- Google for Android SDK and Jetpack Compose
- Developer community for open-source libraries
- Everyone who tested the application
- Manus AI for assistance in developing version 1.1

## 💬 About This Project

This app was created as a personal tool to help quit smoking. It's now shared with the community in hopes that it might help others on their journey to a healthier lifestyle. While the UI is currently in Russian, the codebase is clean and well-structured, making localization straightforward for anyone interested in adapting it to other languages.

Feel free to use, modify, and improve this app for your personal needs. If it helps even one person quit their bad habit, the project has achieved its goal.

**Made with ❤️ for a healthy lifestyle**

*Version: 1.1 | Date: December 04, 2025*

