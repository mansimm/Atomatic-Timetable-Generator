package com.example.mansi.loginpage;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;



public class card_adapter extends RecyclerView.Adapter<card_adapter.ProductViewHolder> {


        //this context we will use to inflate the layout
        private Context mCtx;

        //we are storing all the products in a list
        private List<faculty_card> productList;

        //getting the context and product list with constructor
        public card_adapter(Context mCtx, List<faculty_card> productList) {
            this.mCtx = mCtx;
            this.productList = productList;
        }

        @Override
        public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            //inflating and returning our view holder
            LayoutInflater inflater = LayoutInflater.from(mCtx);
            View view = inflater.inflate(R.layout.cardview_layout, null);
            return new ProductViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ProductViewHolder holder, int position) {
            //getting the product of the specified position
            faculty_card product = productList.get(position);

            //binding the data with the viewholder views
            holder.textViewTitle.setText(product.getTitle());
            holder.textViewShortDesc.setText(product.getShortdesc());
            holder.textViewRating.setText(String.valueOf(product.getRating()));
            holder.textViewPrice.setText(String.valueOf(product.getPrice()));

            holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        }


        @Override
        public int getItemCount() {
            return productList.size();
        }


        class ProductViewHolder extends RecyclerView.ViewHolder {

            TextView textViewTitle, textViewShortDesc, textViewRating, textViewPrice;
            ImageView imageView;

            public ProductViewHolder(View itemView) {
                super(itemView);

                textViewTitle = itemView.findViewById(R.id.textViewTitle);
                textViewShortDesc = itemView.findViewById(R.id.textViewShortDesc);
                textViewRating = itemView.findViewById(R.id.textViewRating);
                textViewPrice = itemView.findViewById(R.id.textViewPrice);
                imageView = itemView.findViewById(R.id.imageView);
            }
        }
    }

