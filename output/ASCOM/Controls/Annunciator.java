package ASCOM.Controls;

/*

              
                Wikipedia: An annunciator panel is a group of lights used as a central indicator of status of equipment or systems in an aircraft,
                industrial process, building or other installation. Usually the annunciator panel includes a main warning lamp or audible signal
                to draw the attention of operating personnel to the annunciator panel for abnormal events or conditions.
              
              
                The Anunciator control provides a simple, standard method of displaying a status notification to the user within a Windows Forms application.
                Anunciators are best used with the companion  control, although they can be placed anywhere on a Windows Form.
                The control can be used to provide simple On/Off status displays or can be configured to blink with various levels of urgency so that it can
                represent alarm conditions.
                
                  An anunciator may represent the slewing state of a telescope. It would be represented by the word "SLEW". When the telescope is stationary,
                  the anunciator remains inactive. When the telescope begins to slew, the anunciator is set to  
                  to alert the user that the equipment is in motion.
                
              
              
                Each anunciator has active and inactive states. When inactive, the control displays in a subdued colour that is readable but does not draw
                attention. When active, the control will display in a stronger, more visible colour and will either have a steady state or will blink in one
                of a number of predefined cadence patterns. The cadence patterns are fixed and not user-definable, so that a standard 'look and feel'
                is promoted accross different applications.
              
              
                Whilst the user is at liberty to choose different colours for both  and , 
                The default colours have been chosen to look similar to earlier applications that use similar displays and the defaults are highly 
                recommended for most circumstances. The control's background colour is inherited from the parent control (which should normally be 
                an ) and is not directly settable by the user.
              
            


*/
public class Annunciator{

/*
null
null
*/
private double ForeColor;
/*
null
null
*/
private double InactiveColor;
/*
null
null
*/
private double ActiveColor;
/*
null
null
*/
private double BackColor;
/*
null
null
*/
private double Mute;
/*
null
null
*/
private double Cadence;


/*

              Initializes a new instance of the  class.
            

*/
public void Annunciator(){
return null;
}


/*

              Unregisters this control from the  so that it will no longer receive cadence updates.
            

*/
public void StopCadenceUpdates(){
return null;
}


/*

              Registers this control with the  so that it will receive cadence updates.
            

*/
public void StartCadenceUpdates(){
return null;
}


/*

            Releases all resources used by the .
            

*/
public void Dispose(){
return null;
}


/*

            Releases the unmanaged resources used by the  and optionally releases the managed resources.
            

*/
public void Dispose(Boolean){
return null;
}


/*

              Updates the anunciator's display, if it has changed since the last update.
            

            Implements the  method.
            The  always calls this method on the GUI thread.
            
*/
public void CadenceUpdate(Boolean){
return null;
}


/*

              Handles the ParentChanged event of the Anunciator control.
              Changes the control's background colour to blend in with the parent control.
            

*/
public void AnnunciatorParentChanged(Object,EventArgs){
return null;
}

/*
 Sets null
null
*/
public void setForeColor(double _theValue){
this.ForeColor=_theValue;
}

/*
 Gets null
null
*/
public double getForeColor(){
return ForeColor;
}

/*
 Sets null
null
*/
public void setInactiveColor(double _theValue){
this.InactiveColor=_theValue;
}

/*
 Gets null
null
*/
public double getInactiveColor(){
return InactiveColor;
}

/*
 Sets null
null
*/
public void setActiveColor(double _theValue){
this.ActiveColor=_theValue;
}

/*
 Gets null
null
*/
public double getActiveColor(){
return ActiveColor;
}

/*
 Sets null
null
*/
public void setBackColor(double _theValue){
this.BackColor=_theValue;
}

/*
 Gets null
null
*/
public double getBackColor(){
return BackColor;
}

/*
 Sets null
null
*/
public void setMute(double _theValue){
this.Mute=_theValue;
}

/*
 Gets null
null
*/
public double getMute(){
return Mute;
}

/*
 Sets null
null
*/
public void setCadence(double _theValue){
this.Cadence=_theValue;
}

/*
 Gets null
null
*/
public double getCadence(){
return Cadence;
}
}
