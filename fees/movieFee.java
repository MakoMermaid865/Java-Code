//ari kinney

// purpus is to chacge the fine for a movive that is late
//ask how many movies you have rented
//there is a discount if you got a romance movie
//and a up charge if you got a horror movie 
//purpose: This program will determine the fine for a movie that is late.
//The program will ask the user for the number of movies that are late and the number of days late.

import java.util.Scanner;

public class movieFee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many movies do you have that are late.");
            int numberOfMovies = scanner.nextInt();
        System.out.print("Enter the number of days late.");
            int days = scanner.nextInt();
        System.out.println("Did you have a romance movie (yes/no)? ");
            String romanceMovie = scanner.next();
        System.out.println("Did you have a horror movie (yes/no)? ");
            String horrorMovie = scanner.next();

        if (numberOfMovies <= 3){
            if (days <= 7){
            
                if (romanceMovie .equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your movies is 1$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                } else 
                    System.out.println("The fine for your movies is 10$ for " + numberOfMovies + " movies and being " + days + " days late.");
            //prompt the user for if they got a horror movie
                if (horrorMovie .equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your movies is 8$ for " + numberOfMovies + " movies and being " + days + " days late.");
                } else 
                    System.out.println("The fine for your movies is 10$ for " + numberOfMovies + " movies and being " + days + " days late.");   
            }
            else if (days <= 14 && days > 7){
                if (romanceMovie.equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your movies is for 2$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                } else 
                    System.out.println("The fine for your book is 15$ for " + numberOfMovies + " movies and being " + days + " days late.");
                //prompt the user for if they got a horror movie
                if (horrorMovie .equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your book is 12$ for " + numberOfMovies + " movies and being " + days + " days late.");
                } else 
                    System.out.println("The fine for your book is 15$ for " + numberOfMovies + " movies and being " + days + " days late.");   
            }
            // if the book is more than 10 days overdue, print the fine is 10 dollars
            else {
                if (romanceMovie.equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your movies is for 3 dollars for " + numberOfMovies + " movies and being " + days + " days late.");    
                } else 
                    System.out.println("The fine for your book is 20 dollar for " + numberOfMovies + " movies and being " + days + " days late.");
                //prompt the user for if they got a horror movie
                if (horrorMovie .equalsIgnoreCase("yes")) {
                    System.out.println("The fine for your book is 16 dollars for " + numberOfMovies + " movies and being " + days + " days late.");
                } else 
                    System.out.println("The fine for your book is 20 dollar for " + numberOfMovies + " movies and being " + days + " days late.");   
            }
                
            }

            else if (numberOfMovies <= 8){
                if (days <= 7){
                    if (romanceMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is 5$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your movies is 30$ for " + numberOfMovies + " movies and being " + days + " days late.");
                //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is 9$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your movies is 30$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
                else if (days <= 14 && days > 7){
                    if (romanceMovie.equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is for 6$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your book is 40$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your book is 14$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your book is 40$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
                // if the book is more than 10 days overdue, print the fine is 10 dollars
                else {
                    if (romanceMovie.equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is for 7$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your book is 50$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your book is 18$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your book is 50$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
            }

            else {
                if (days <= 7){
                    if (romanceMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is 9$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your movies is 60$ for " + numberOfMovies + " movies and being " + days + " days late.");
                //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is 10$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your movies is 60$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
                else if (days <= 14 && days > 7){
                    if (romanceMovie.equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is for 10$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your book is 70$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your book is 20$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your book is 70$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
                // if the book is more than 10 days overdue, print the fine is 10 dollars
                else {
                    if (romanceMovie.equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your movies is for 11$ for " + numberOfMovies + " movies and being " + days + " days late.");    
                    } else 
                        System.out.println("The fine for your book is 100$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    //prompt the user for if they got a horror movie
                    if (horrorMovie .equalsIgnoreCase("yes")) {
                        System.out.println("The fine for your book is 30$ for " + numberOfMovies + " movies and being " + days + " days late.");
                    } else 
                        System.out.println("The fine for your book is 100$ for " + numberOfMovies + " movies and being " + days + " days late.");   
                }
        }
    }
}

