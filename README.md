# Supplify

## Overview

Supplify is a mobile application designed to help convenience store employees and managers, as well as specific gas stations, consolidate product orders from multiple suppliers into a single interface. The app automates order preparation and communication, improving efficiency and reducing errors.

## System Architecture Overview

Supplify follows a Client-Server architecture, consisting of:

**Frontend:** A React Native application handling the user interface and API calls.

**Backend:** A Spring Boot server managing business logic and database operations.

**Database:** A MySQL database storing system data.

**WhatsApp Business API (Twilio):** Used for supplier communication and notifications.

## Features

**Supplier Management:** Easily add, remove, and update supplier details.

**Order Consolidation:** Automatically combine orders from different suppliers into a unified order list.

**Inventory Tracking:** Keep track of stock levels and order history.

**Automated Communication:** Send orders directly to suppliers via WhatsApp Business API (Twilio).

**User Roles:** Separate views and functionalities for employees and managers

## Backend Code Structure

supplify-backend/
├── src/main/java/com/supplify/
│   ├── entities/         # JPA Entities (e.g., Agent, Supplier, Order)
│   ├── repositories/     # Database access layer (Spring Data JPA)
│   ├── services/         # Business logic layer
│   ├── controllers/      # REST API endpoints
│   ├── dto/              # Data Transfer Objects
│   ├── config/           # Configuration files
│   ├── utils/            # Utility classes
└── src/main/resources/
    ├── application.yml   # Spring Boot configuration

### Installation

#### Backend Setup

1.Clone the repository.

2.Install dependencies:

3.Run the application.

#### Frontend Setup

1.navigate to the frontend directory:

cd ../frontend

2.Install dependencies:

npm install

3.Run the React Native app:

npx react-native run-android

## API Endpoints

### Authentication

POST /auth/register - User registration

POST /auth/login - User login

POST /auth/forgotPassword - Forgot password

POST /auth/google - Google authentication

POST /auth/updateDeviceToken - Update device token

### Business

GET /business/getBusinessSuppliers - Get suppliers associated with a business

GET /business/getBusinessSuppliersAndAgents - Get suppliers and agents

GET /business/getBusinessProducts - Get products associated with a business

DELETE /business/deleteSupplierFromBusiness - Remove supplier from business

PUT /business/updateAgent - Update agent information

### Users

POST /user/resetPassword - Reset user password

POST /user/createUser - Create a new user

### Suppliers

POST /suppliers/createSupplier - Create a new supplier

GET /suppliers/getAllSuppliers - Retrieve all suppliers

DELETE /suppliers/deleteSupplier - Remove a supplier

### Agents

POST /agents/addAgent - Add a new agent

### Products

POST /product/createProduct - Create a new product

GET /product/displayProducts - Display all products

GET /product/fetchProduct - Retrieve a specific product

### Orders

POST /orders/CreateOrder - Create a new order

GET /orders/getOrders - Retrieve all orders

GET /orders/getOrderInfo - Retrieve order details

GET /orders/getPendingOrders - Get all pending orders

PUT /orders/OrderConfirm - Confirm an order

## 📸 Visual Guide
To make this documentation more user-friendly, we’ve included screenshots of the key features of Supplify. These images provide a clear understanding of how the app works, making it easier for new users to navigate and use the system efficiently.

### 1️⃣ Login & Registration

<p align="center">
 <img src="Figure/Login.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" />
 <img src="Figure/NewBusiness.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" /> 
</p>


### 2️⃣ Home Page & SideBar

<p align="center">
 <img src="Figure/HomePage.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" />
 <img src="Figure/SideBar.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" /> 
</p>


### 3️⃣ Orders

<p align="center">
 <img src="Figure/ShoppingBag.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" />
 <img src="Figure/OrderDetails.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" /> 
</p>
<p align="center">
 <img src="Figure/OrderList.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" />
</p>


### 4️⃣ Add Product & Business

<p align="center">
 <img src="Figure/AddNewProduct.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" />
 <img src="Figure/AddNewSupplier.png" width="45%" style="display: inline-block; border: 1px solid #ddd; border-radius: 8px; box-shadow: 0 4px 8px rgba(0,0,0,0.1); margin: 10px;" /> 
</p>



