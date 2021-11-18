---
layout: post
title: "Final Project Proposal"
date: 2021-11-12
---

# Final Project Proposal

# App Name:
### OnTheRoad: LBS based Android App for smart driving 
Developed an Android App for users to exchange the nearby real-time events with Google Firebase Platform.

# App Description:
OnTheRoad is an Android Project which provides a general platform for drivers to share traffic condition events. 
Drivers are able to register their accounts and able to login. Driver can upload events, watch events, check details and give comments on Google Map interface.

OnTheRoad uses cutting-edge framework Firebase to establish flexible and maintainable backend service group. Uses Toolbar, ViewPager and NavigationView combination to build user-friendly UI framework. Integrated Google Map to allow users checking instant events at their convenience. 

# Problem that the application solve:
Drivers cannot get the most updated traffic event such as an small accident on the way home. OnTheRoad support deivers to report the traffic event they experienced in real time so that other users get to know the triffic situation at that point so as to avoid drive to that road.

# Target Users:
People who need to get the real tiem traffic event while driving.

# 5 features:
**Real Time:** The database is backed by a real-time connection to the back end, and if you use the Firebase SDK, you get live updates in your app any time something changes.


**Speed:** The SDK handles all network traffic and saves the time to take consideration of networking layer. Firebase database is based on Nosql, updating data is in milliseconds.

**Offline Cache:** Firebase provide offline caching, even users update while they are offline, the data will not lost.


**Google Owned:** Firebase is well integrate with Android platform 

**Backend Service Group:** Firebase provides easy to use and powerful backend group services. We can quickly develop an app by taking advantage of it.

# Schedule of milestones:
## 11.12 : design the app 
* Designed the app based on single activity architecture. Attached the activity with parallel fragments with various functionalities. Kept the design as simple as possible. Separate code modules according to fragments. 

## 11.18
* OnBording
* ViewPager
* Firebase Setup

## 11.25
* Action Bar
* Navigation View With Action Bar
* Add Logout function
* Google Map Service Setup

## 12.2
* Google Map Service Implementation

## 12.9 
* Recycler view
* Switch between layouts
* Report Event To FireBase
* Test and Firebase Storage

## 12.16
* Listen To Firebase Database
* Finalize the final project

## The most challenging part of the project:
Fetching data from backend server and display on screen.
