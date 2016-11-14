package times;
class Time{
	int hour;
	int minute;
	int second;
	Time()
	{
		  hour=0;
		  minute=0;
		  second=0;
	}
	Time(int hour,int minute,int second)
	{
          this.hour=hour;
          this.minute=minute;
          this.second=second;
	}
	void nextSecond()
	{
		  if(this.second==59)
		  {
		  	this.second=0;
		  	if(this.minute==59)
		    {
		  		this.minute=0;
		  	    if(this.hour==23)
		  		   this.hour=0;
		  	    else
		  		   this.hour+=1;
		    }
		    else
		    this.minute+=1;
		  }
		  else
		  	this.second+=1;
		  print(this.hour,this.minute,this.second);
	}

	void nextMinute()
	{
		if(this.minute==59)
		    {
		  		this.minute=0;
		  	    if(this.hour==23)
		  		   this.hour=0;
		  	    else
		  		   this.hour+=1;
		    }
	    else
		    this.minute+=1;
		print(this.hour,this.minute,this.second);
	}
	void nextHour()
	{
		if(this.hour==23)
		  	this.hour=0;
		else
		  	this.hour+=1;
		  print(this.hour,this.minute,this.second);
	}
	void previousSecond()
	{
		if(this.second==0)
	    {
	    	this.second=59;
	    	if(this.minute==0)
	    	{
	    		this.minute=59;
	    		if(this.hour==0)
	    			this.hour=23;
	    		else
	    			this.hour-=1;
	    	}
	    	else
	    		this.minute-=1;
	    }
	    else
	    	this.second-=1;
	    print(this.hour,this.minute,this.second);
	}
	void previousMinute()
	{
		if(this.minute==0)
	    	{
	    		this.minute=59;
	    		if(this.hour==0)
	    			this.hour=23;
	    		else
	    			this.hour-=1;
	    	}
	    else
	    	this.minute-=1;
	    	print(this.hour,this.minute,this.second);
	}
	void previousHour()
	{
		if(this.hour==0)
	    	this.hour=23;
	    else
	    	this.hour-=1;
	    print(this.hour,this.minute,this.second);
	}
	void print(int hour,int minute,int second)
	{
			System.out.printf("Time:%02d:%02d:%02d",hour,minute,second);
	}
}