package com.ramzi.chunkproject.player;

import com.google.android.exoplayer2.source.ConcatenatingMediaSource;

/**
 * Created by voltella on 22/1/19.
 *
 * @auther Ramesh M Nair
 */
public interface MediaFileCallback {

     void onMediaFileRecieve(ConcatenatingMediaSource mediaSource,String filename,long totalTIme,int totalIndex);
     void onMediaFileRecieve(boolean status);

}
