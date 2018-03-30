package refactoring.chap13;

import java.util.Random;

public class Dice extends Random {

	public Dice() {
		super(314159L);
	}

	public Dice(long seed) {
		super(seed);
	}
	
	@Override
	public int nextInt() {
		return nextInt(6) + 1;
	}

	@Override
	public void nextBytes(byte[] bytes) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public long nextLong() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean nextBoolean() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public float nextFloat() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	@Override
	public double nextDouble() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}
	
	@Override
	public synchronized double nextGaussian() {
		// TODO Auto-generated method stub
		return super.nextGaussian();
	}
	
	
}
