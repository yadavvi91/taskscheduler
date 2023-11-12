# Task Scheduler

Create APIs and tables to manage tasks and their statuses with additional functionalities like assigning tasks to users, setting due dates, and tracking progress. Here are the API requirements and business logic: (Please use Java 8 or above)

### 1. Create Task:

* Endpoint: `POST /api/tasks`
* Request Body: Task object (title, description, dueDate)
* Description: Create a new task with the provided title, description, and due date.

### 2. Update Task:

* Endpoint: `PUT /api/tasks/{taskId}`
* Request Body: Task object (title, description, dueDate, status)
* Description: Update an existing task with the provided details, including the status. If the status is changed to "Completed," set the completed date.

### 3. Delete Task:

* Endpoint: `DELETE /api/tasks/{taskId}`
* Description: Delete a task.

### 4. Get All Tasks:

* Endpoint: `GET /api/tasks`
* Description: Get a list of all tasks.

### 5. Assign Task:

* Endpoint: `POST /api/tasks/{taskId}/assign`
* Request Body: User ID
* Description: Assign a task to a specific user.

### 6. Get User's Assigned Tasks:

* Endpoint: `GET /api/users/{userId}/tasks`
* Description: Get a list of tasks assigned to a specific user.

### 7. Set Task Progress:

* Endpoint: `PUT /api/tasks/{taskId}/progress`
* Request Body: Progress percentage (0-100)
* Description: Set the progress percentage of a task.

### 8. Get Overdue Tasks:

* Endpoint: `GET /api/tasks/overdue`
* Description: Get a list of tasks that are overdue based on the current date and the task's due date.
