/* *****************************************************************************
 *              ALL STUDENTS COMPLETE THESE SECTIONS
 * Title:            GuitarString
 * Files:            GuitarString.java,
 * 					 
 * Semester:         Spring 2020
 * 
 * Author:           Isabella MacDonald isma8011@colorado.edu
 * 
 * Description:		 A single guitar string simulated using the 
 * 					 Karplus-Strong algorithm
 * 
 * Written:       	 3/13/2020
 * 
 * Credits:          Recitation
 **************************************************************************** */

/**
 * This class represents a single guitar string or piano wire, which is simulated using
 * the Karplus-Strong algorithm. When a guitar string is plucked or a piano wire struck, 
 * it vibrates and creates sound. The vibration can be measured by sampling the 
 * displacement of the wire at equally spaced points. These displacement measurements 
 * can be stored digitally, say in a list or queue structure, then used to recreate 
 * the sound wave over a speaker.
 * 
 * More specifically, the length of a string or wire determines its fundamental frequency 
 * of vibration. We model a guitar string by sampling its displacement 
 * (a real number between -1/2 and +1/2) at N equally spaced points (in time), 
 * where N equals the sampling rate (44,100) divided by the fundamental frequency 
 * (rounding the quotient up to the nearest integer)
 * 
 * @author Isabella MacDonald
 *
 */
public class GuitarString {
	
	// Karplus-Strong energy decay factor
	public static final double ENERGY_DECAY_FACTOR = 0.994;
	
	// Queue to hold the displacement values a equally-spaced points along the guitar string
	private FixedSizeQueue<Double> queue;
	
	// Number of time steps that have been simulated
	private int numTics;
	
	/**
	 * Create a new guitar string for a certain frequency. For example, setting
	 * frequency to 440 would give you a string tuned to Concert A.
	 * 
	 * Psuedocode:
	 * 	1. Calculate N: the length of the queue you will need for the specified frequency
	 *     where N = the sampling rate 44,100 divided by frequency, rounded up to the 
	 *     nearest integer
	 *  
	 *  2. Initialize your queue using this calculated capacity N and initialize 
	 *     the queue to represent a guitar string at rest by enqueueing N zeros.
	 * 
	 * @param frequency The frequency for the guitar string
	 */
	public GuitarString(double frequency)
	{
		int N = 0;
		
		//making sure the result is an int
		N = (int)Math.ceil(44100/frequency);
		
		//making queue of the calculated size
		queue = new FixedSizeQueue<Double>(N);
		
		//filling the queue with empty values
		for (int i = 0; i < N; i++)
		{
			queue.enqueue(0.0);
		}
	}
	
	/**
	 * Simulates plucking a guitar string.
	 * 
	 * Psuedocode:
	 *  Set the queue to white noise by replacing all N items in the queue with N random
	 *  values between -0.5 and +0.5
	 *  
	 * Hint - you can do this by simply dequeuing and enqueuing values, but there's a much
	 * faster and more efficient way that doesn't require any dequeue calls...
	 */
	public void pluck()
	{
		//making a new queue that holds the white noise sounds
		int size = queue.size();
		queue = new FixedSizeQueue<Double>(queue.size());
		
		for (int i = 0; i < size; i++)
		{
			queue.enqueue(Math.random() - 0.5);
		}
	}
	
	/**
	 * Simulates one time step by applying the Karplus-Strong update.
	 * 
	 * Psuedocode:
	 *  1. Remove the sample at the front of the queue, storing its value in a temporary variable 
	 *  
	 *  2. Add to the end of the queue the average of the first two samples (i.e., the sample you
	 *     just removed and the sample that is now at the front of the queue) 
	 *     multiplied by the energy decay factor.
	 *  
	 *  3. Update numTics
	 */
	public void tic()
	{
		double front = queue.dequeue();
		
		//computing the actual value
		double avg = (front + queue.peek())/2;
		
		queue.enqueue(avg*ENERGY_DECAY_FACTOR);
		
		numTics++;
		
	}
	
	/**
	 * Get the sample value that is at the front of the queue (do not remove this value
	 * from the queue).
	 * 
	 * @return The sample value currently at the front of the queue
	 */
	public double sample()
	{
		//can use part of the queue implementation
		return queue.peek();
	}
	
	/**
	 * Gets the total number of times tic() has been called (i.e., the numer of time-steps
	 * we have simulated so far).
	 * 
	 * @return The number of times the tic() method has been called
	 */
	public int time()
	{
		//numtics is our int counter already implemented
		return numTics;
	}

}
