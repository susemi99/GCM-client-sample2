package kr.susemi99.gcm.managers;

import android.content.Context;

public class PreferenceManager extends BasePreferenceManager
{
  private static PreferenceManager instance;
  private Context context;


  public static PreferenceManager instance(Context context)
  {
    if (instance == null)
    {
      synchronized (PreferenceManager.class)
      {
        if (instance == null)
        {
          instance = new PreferenceManager(context);
        }
      }
    }
    return instance;
  }


  private PreferenceManager(Context context)
  {
    super(context);
    this.context = context;
  }

  private static final String SENT_TOKEN_TO_SERVER = "sent_token_to_server";

  public void sentToken(boolean sent)
  {
    put(SENT_TOKEN_TO_SERVER, sent);
  }

  public boolean sentToken()
  {
    return get(SENT_TOKEN_TO_SERVER, false);
  }
}