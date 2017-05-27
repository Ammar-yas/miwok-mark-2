package com.example.android.miwok;


public class Word {

    private String mDefaultTranslation;
    private String mEnglishTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int imageResourceID = NO_IMAGE_PROVIDED;
    /**
     * Create a new word object with word or sentence and its english translation only
     *
     * @param mDefaultTranslation is the language that the user wants
     *                            to use (such as franko arabic)
     * @param mEnglishTranslation is the english translation for the word
     */

    public Word(String mDefaultTranslation, String mEnglishTranslation) {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
    }

    /**
     * Create a new word object with word or sentence and its english translation with descriptive
     * image
     *
     * @param mDefaultTranslation is the language that the user wants
     *                            to use (such as franko arabic)
     * @param mEnglishTranslation is the english translation for the word
     * @param imageResourceID     is the resource ID for the image that describe the word
     */


    public Word(String mDefaultTranslation, String mEnglishTranslation, int imageResourceID) {

        this.mDefaultTranslation = mDefaultTranslation;
        this.mEnglishTranslation = mEnglishTranslation;
        this.imageResourceID = imageResourceID;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setmDefaultTranslation(String mDefaultTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
    }

    public String getmEnglishTranslation() {
        return mEnglishTranslation;
    }

    public void setmEnglishTranslation(String mEnglishTranslation) {
        this.mEnglishTranslation = mEnglishTranslation;
    }

    public int getimageResourceID() {
        return imageResourceID;
    }

    public void setimageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }

    public boolean hasImage(){
        return  imageResourceID != NO_IMAGE_PROVIDED;
    }
}
