package ASCOM.Astrometry.NOVASCOM;

/*

                Interface to the NOVAS-COM PositionVector Class
            

Objects of class PositionVector contain vectors used for positions (earth, sites, 
                stars and planets) throughout NOVAS-COM. Of course, its properties include the x, y, and z 
                components of the position. Additional properties are right ascension and declination, distance, 
                and light time (applicable to star positions), and Alt/Az (available only in PositionVectors 
                returned by Star or Planet methods GetTopocentricPosition()). You can initialize a PositionVector 
                from a Star object (essentially an FK5 or HIP catalog entry) or a Site (lat/long/height). 
                PositionVector has methods that can adjust the coordinates for precession, aberration and 
                proper motion. Thus, a PositionVector object gives access to some of the lower-level NOVAS functions. 
                
                    Note: The equatorial coordinate properties of this object are dependent variables, and thus are read-only. Changing any cartesian coordinate will cause the equatorial coordinates to be recalculated. 
                
            
*/
public class IPositionVector{

/*
null
null
*/
private double Azimuth;
/*
null
null
*/
private double Declination;
/*
null
null
*/
private double Distance;
/*
null
null
*/
private double Elevation;
/*
null
null
*/
private double LightTime;
/*
null
null
*/
private double RightAscension;
/*
null
null
*/
private double x;
/*
null
null
*/
private double y;
/*
null
null
*/
private double z;


/*

                Adjust the position vector of an object for aberration of light
            
The algorithm includes relativistic terms
*/
public void Aberration(ASCOM.Astrometry.NOVASCOM.VelocityVector){
return null;
}


/*

                Adjust the position vector for precession of equinoxes between two given epochs
            
The coordinates are referred to the mean equator and equinox of the two respective epochs.
*/
public void Precess(Double,Double){
return null;
}


/*

                Adjust the position vector for proper motion (including foreshortening effects)
            

*/
public void ProperMotion(ASCOM.Astrometry.NOVASCOM.VelocityVector,Double,Double){
return null;
}


/*

                Initialize the PositionVector from a Site object and Greenwich apparent sidereal time.
            
The GAST parameter must be for Greenwich, not local. The time is rotated through the 
                site longitude. See SetFromSiteJD() for an equivalent method that takes UTC Julian Date and 
                Delta-T (eliminating the need for calculating hyper-accurate GAST yourself).
*/
public void SetFromSite(ASCOM.Astrometry.NOVASCOM.Site,Double){
return null;
}


/*

                Initialize the PositionVector from a Site object using UTC Julian date and Delta-T
            
The Julian date must be UTC Julian date, not terrestrial.
            
*/
public void SetFromSiteJD(ASCOM.Astrometry.NOVASCOM.Site,Double,Double){
return null;
}


/*

                Initialize the PositionVector from a Star object.
            

*/
public void SetFromStar(ASCOM.Astrometry.NOVASCOM.Star){
return null;
}

/*
 Sets null
null
*/
public void setAzimuth(double _theValue){
this.Azimuth=_theValue;
}

/*
 Gets null
null
*/
public double getAzimuth(){
return Azimuth;
}

/*
 Sets null
null
*/
public void setDeclination(double _theValue){
this.Declination=_theValue;
}

/*
 Gets null
null
*/
public double getDeclination(){
return Declination;
}

/*
 Sets null
null
*/
public void setDistance(double _theValue){
this.Distance=_theValue;
}

/*
 Gets null
null
*/
public double getDistance(){
return Distance;
}

/*
 Sets null
null
*/
public void setElevation(double _theValue){
this.Elevation=_theValue;
}

/*
 Gets null
null
*/
public double getElevation(){
return Elevation;
}

/*
 Sets null
null
*/
public void setLightTime(double _theValue){
this.LightTime=_theValue;
}

/*
 Gets null
null
*/
public double getLightTime(){
return LightTime;
}

/*
 Sets null
null
*/
public void setRightAscension(double _theValue){
this.RightAscension=_theValue;
}

/*
 Gets null
null
*/
public double getRightAscension(){
return RightAscension;
}

/*
 Sets null
null
*/
public void setX(double _theValue){
this.x=_theValue;
}

/*
 Gets null
null
*/
public double getX(){
return x;
}

/*
 Sets null
null
*/
public void setY(double _theValue){
this.y=_theValue;
}

/*
 Gets null
null
*/
public double getY(){
return y;
}

/*
 Sets null
null
*/
public void setZ(double _theValue){
this.z=_theValue;
}

/*
 Gets null
null
*/
public double getZ(){
return z;
}
}
