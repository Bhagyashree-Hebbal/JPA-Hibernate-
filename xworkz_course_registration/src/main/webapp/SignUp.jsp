<%@page isELIgnored = "false"%>
<html>
<head>
    <title>SignUp Page</title>
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header bg-primary text-white text-center">
                        <h2>Sign Up</h2>
                    </div>
                    <div class="card-body">
                        <form action="signup" method="post">
                            <div class="form-group">
                                <label for="name">Name:</label>
                                <input type="text" name="name" id="name" class="form-control" placeholder="Enter the Name" required>
                            </div>
                            <div class="form-group">
                                <label for="email">Email:</label>
                                <input type="email" name="email" id="email" class="form-control" placeholder="Enter the Email" required>
                            </div>
                            <div class="form-group">
                                <label for="age">Age:</label>
                                <input type="number" name="age" id="age" class="form-control" placeholder="Enter the Age" required>
                            </div>
                            <div class="form-group">
                                <label for="phoneNo">Phone Number:</label>
                                <input type="number" name="phoneNo" id="phoneNo" class="form-control" placeholder="Enter the Phone Number" required>
                            </div>
                            <div class="form-group">
                                <label for="password">Password:</label>
                                <input type="password" name="password" id="password" class="form-control" placeholder="Enter the Password" required>
                            </div>
                            <div class="form-group">
                                <label for="confirmPassword">Confirm Password:</label>
                                <input type="password" name="confirmPassword" id="confirmPassword" class="form-control" placeholder="Enter the Confirm Password" required>
                            </div>
                            <button type="submit" class="btn btn-primary btn-block">Sign Up</button>
                        </form>
                    </div>
                    <div class="card-footer text-center text-success">
                        <span>${msg}</span>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- Include Bootstrap JS and dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
