package com.example.demo.Models;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "recipe")
public class Recipe {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long id;
	    private String nationality;
	    private String name;
		@Column(columnDefinition = "TEXT")
	    private String instructions;
	    private List<String> ingredients;
	    private String overallCookingTime;
		@Column(name = "isVegetarian")
		private String isVegetarian;
		private long search;

		public Recipe(){

		}
	

	    public Recipe(String nationality, String name, String instructions, List<String> ingredients, String overallCookingTime, String isVegetarian) {
	        this.nationality = nationality;
			this.isVegetarian = isVegetarian;
	        this.name = name;
			search = 0;
	        this.instructions = instructions;
	        this.ingredients = ingredients;
	        this.overallCookingTime = overallCookingTime;
	    }

		public long getSearch(){
			return search;
		}
		public void setSearch(Long num){
			search = num;
		}


	    public String getNationality() {
	        return nationality;
	    }


		public long getID(){
			return id;
		}

	    public String getName() {
	        return name;
	    }

	    public String getInstructions() {
	        return instructions;
	    }

	    public List<String> getIngredients() {
	        return ingredients;
	    }

	    public String getOverallCookingTime() {
	        return overallCookingTime;
	    }

	@Override
	public String toString() {
		return "Recipe{" +
				"nationality='" + nationality + '\n' +
				", name='" + name + '\n' +
				", instructions='" + instructions + '\n' +
				", ingredients=" + ingredients +
				", overallCookingTime='" + overallCookingTime + '\n' +
				", isVegetarian='" + isVegetarian + '\n' +
				'}';
	}
}
