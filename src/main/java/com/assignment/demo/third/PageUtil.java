package com.assignment.demo.third;

public class PageUtil {


  public static void main(String[] args) {
  int[] requestedPage = {5, 0, 1, 3, 2, 4, 1, 0, 5};
  int noOfAvailablePages = 4;
  System.out.println(getPageFault(4, requestedPage));
  }

  /**
   * This method will accept the noOfAvailablePages & return pageFault
   * @param noOfAvailablePages
   * @param requestedPage
   * @return
   */
  public static int getPageFault(int noOfAvailablePages, int[] requestedPage){
    int pageFault = 0;
    int index = 0;
    int[] pages = { -1, -1, -1 ,-1 };
    for(int page : requestedPage){
      if(!contains(pages, page)){
        pages[index]= page;
        pageFault++;
        index++;
        if(index == noOfAvailablePages){
          index = 0;
        }
      }
    }
    return pageFault;

  }

  private static boolean contains(int[] pages, int page) {
    for(int p : pages){
      if(p == page){
        return true;
      }
    }
    return false;
  }


}
