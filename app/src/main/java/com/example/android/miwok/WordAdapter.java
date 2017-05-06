package com.example.android.miwok;


import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (convertView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaulTranslation = (TextView) listItemView.findViewById(R.id.txt_defaultTranslation);
        TextView englishTranslation = (TextView) listItemView.findViewById(R.id.txt_englishTranslation);
        ImageView descriptiveImage = (ImageView) listItemView.findViewById(R.id.im_descriptivePicture);

        defaulTranslation.setText(currentWord.getmDefaultTranslation());
        englishTranslation.setText(currentWord.getmEnglishTranslation());
        if (currentWord.hasImage()) {
            descriptiveImage.setImageResource(currentWord.getimageResourceID());
            descriptiveImage.setVisibility(View.VISIBLE);
        }else {
            descriptiveImage.setVisibility(View.GONE);
        }


        return listItemView;
    }
}