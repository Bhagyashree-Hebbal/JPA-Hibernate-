<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <h1 class="text-center">Admin Form</h1>
        <form action="save" method="post" class="mt-4">
            <div class="mb-3">
                <label for="name" class="form-label">Name</label>
                <input type="text" id="name" name="name" class="form-control" placeholder="Enter the Name">
            </div>
            <div class="mb-3">
                <label for="age" class="form-label">Age</label>
                <input type="text" id="age" name="age" class="form-control" placeholder="Enter the Age">
            </div>
            <div class="mb-3">
                <label for="email" class="form-label">Email</label>
                <input type="text" id="email" name="email" class="form-control" placeholder="Enter the Email">
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="text" id="password" name="password" class="form-control" placeholder="Enter the Password">
            </div>
            <div class="mb-3">
                <label for="confirmPassword" class="form-label">Confirm Password</label>
                <input type="text" id="confirmPassword" name="confirmPassword" class="form-control" placeholder="Enter the Confirm Password">
            </div>
            <div class="mb-3">
                <label for="phoneNumber" class="form-label">Phone Number</label>
                <input type="text" id="phoneNumber" name="phoneNumber" class="form-control" placeholder="Enter the Phone Number">
            </div>
    <button type="submit" class="btn btn-primary">Submit</button>
            </form>
        </div>

        <!-- Bootstrap JS -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>