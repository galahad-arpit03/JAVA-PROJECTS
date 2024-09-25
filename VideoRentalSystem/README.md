

# Video Rental Inventory System

## Project Overview

The **Video Rental Inventory System** is designed to manage the inventory of a small video rental store. This simple inventory control system allows users to add videos, check out videos, return videos, receive ratings, and list the current inventory of available videos. 

## Features

- Add new videos to the inventory.
- Check out videos for rental.
- Return rented videos.
- Rate videos.
- List all videos with their checkout status and ratings.

## Class Descriptions

### 1. Video

The `Video` class represents a single video in the rental store. It contains the following member variables and functions:

- **Member Variables:**
  - `String videoName`: The name of the video.
  - `boolean checkout`: The status indicating whether the video is checked out.
  - `int rating`: The rating of the video.

- **Member Functions:**
  - `String getName()`: Returns the name of the video.
  - `void doCheckout()`: Marks the video as checked out.
  - `void doReturn()`: Marks the video as returned.
  - `void receiveRating(int rating)`: Accepts a rating for the video.
  - `int getRating()`: Returns the current rating of the video.
  - `boolean getCheckout()`: Returns the checkout status of the video.

- **Constructor:**
  - `Video(String name)`: Initializes the video with its name.

### 2. VideoStore

The `VideoStore` class manages the collection of videos in the store. It provides functionality to manipulate the inventory.

- **Member Variables:**
  - `Video[] store`: An array to hold the videos in the inventory.

- **Member Functions:**
  - `void addVideo(String name)`: Adds a new video to the inventory.
  - `void doCheckout(String name)`: Checks out a specified video.
  - `void doReturn(String name)`: Returns a specified video.
  - `void receiveRating(String name, int rating)`: Receives a rating for a specified video.
  - `void listInventory()`: Displays the current inventory of videos along with their checkout status and ratings.

### 3. VideoLauncher

The `VideoLauncher` class contains the `main` method, which serves as the entry point for the program. It implements the user interface for interacting with the video rental system.

## Usage Instructions

1. **Compile and Run the Program:**
   - Navigate to the directory containing the compiled classes.
   - Run the command: 
     ```
     java VideoLauncher
     ```

2. **Main Menu Options:**
   - After launching, the main menu will appear with the following options:
     1. Add Videos
     2. Check Out Video
     3. Return Video
     4. Receive Rating
     5. List Inventory
     6. Exit

3. **Performing Actions:**
   - Choose an option by entering the corresponding number (1-6).
   - Follow the prompts to add videos, check out or return videos, rate videos, and list the inventory.

### Example Interaction

- **Adding a Video:**
  ```
  Enter your choice (1..6): 1
  Enter the name of the video you want to add: Matrix
  Video "Matrix" added successfully.
  ```

- **Rating a Video:**
  ```
  Enter your choice (1..6): 4
  Enter the name of the video you want to rate: Matrix
  Enter the rating for this video: 9
  Rating "9" has been mapped to the Video "Matrix".
  ```

- **Checking Out a Video:**
  ```
  Enter your choice (1..6): 2
  Enter the name of the video you want to check out: Matrix
  Video "Matrix" checked out successfully.
  ```

- **Listing Inventory:**
  ```
  Enter your choice (1..6): 5
  Video Name   Checkout   Rating
  Matrix       true       9
  ```

- **Returning a Video:**
  ```
  Enter your choice (1..6): 3
  Enter the name of the video you want to return: Matrix
  Video "Matrix" returned successfully.
  ```

## Conclusion

The **Video Rental Inventory System** is a simple yet effective tool for managing a video rental store. With its straightforward functionality, users can easily keep track of their video inventory and rental operations.

