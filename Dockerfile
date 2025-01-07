# Use the official Oeclipse-temurin image
FROM eclipse-temurin:21

# Set the working directory inside the container
WORKDIR /app

# Copy all files from the current directory on the host to the /app directory in the container
COPY . /app

# Compile the Java program
RUN javac Main.java

# Command to run the Java program
CMD ["java", "Main"]
