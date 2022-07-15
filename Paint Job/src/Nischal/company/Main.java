package Nischal.company;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println(getBucketCount(-3.4,2.1,1.5,1));
        System.out.println(getBucketCount(3.4,2.1,1.5,2));
        System.out.println(getBucketCount(2.75,3.25,2.5,1));
        System.out.println(getBucketCount(-3.4,2.1,1.5));
        System.out.println(getBucketCount(3.4,2.1,1.5));
        System.out.println(getBucketCount(7.25,4.3,2.35));




    }
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        if((width > 0) && (height > 0) && (areaPerBucket > 0) && (extraBuckets >= 0))
        {
            double areaToBePainted = width*height;
            double numberOfBucketsRequired = areaToBePainted/areaPerBucket;
            numberOfBucketsRequired = Math.round(numberOfBucketsRequired);
            int numberOfBucketsToBeBought = (int)numberOfBucketsRequired-extraBuckets;
            return numberOfBucketsToBeBought;
        }
        return -1;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        if((width > 0) && (height > 0) && (areaPerBucket > 0))
        {
            double areaToBePainted = width*height;
            double numberOfBucketsRequired = areaToBePainted/areaPerBucket;
            numberOfBucketsRequired = Math.round(numberOfBucketsRequired);
            int numberOfBucketsTobeBought = (int)numberOfBucketsRequired;
            return numberOfBucketsTobeBought;
        }
        return -1;
    }

}
